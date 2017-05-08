package com.yonglong.framework.lucene.demo;

import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StringField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopScoreDocCollector;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import java.io.IOException;

/**
 * @author MaYongLong
 * @date 2017/5/8.
 */
public class TestLucene {

    public static void main(String[] args) throws IOException,ParseException {
        //0.Specify the analyzer for tokenizing text.
        StandardAnalyzer analyzer = new StandardAnalyzer();
        //1.create
        Directory index = new RAMDirectory();
        IndexWriterConfig config = new IndexWriterConfig(analyzer);
        //创建一个IndexWriter 用来写索引文件，它有几个参数，INDEX_DIR 就是索引文件所存放的位置，
        // Analyzer 便是用来对文档进行词法分析和语言处理的
        IndexWriter  writer = new IndexWriter(index,config);
        addDoc(writer,"Lucene in Action","193398817");
        addDoc(writer,"Lucene for Dummies","55320055Z");
        addDoc(writer,"Managing Gigabytes","55063554A");
        addDoc(writer,"The Art of Computer Science","9900333X");
        writer.close();

        //2.query
        // 创建QueryParser 用来对查询语句进行语法分析,QueryParser 调用parser 进行语法分析，形成查询语法树，放到Query 中
        String queryStr = args.length > 0? args[0]:"Managing";
        Query query = new QueryParser("title",analyzer).parse(queryStr);

        //3.search
        int hitsPerPage = 10;
        //IndexReader 将磁盘上的索引信息读入到内存
        IndexReader reader = DirectoryReader.open(index);
        IndexSearcher searcher = new IndexSearcher(reader);
        TopScoreDocCollector collector = TopScoreDocCollector.create(hitsPerPage);
        //IndexSearcher 调用search 对查询语法树Query 进行搜索，得到结果TopScoreDocCollector
        searcher.search(query,collector);
        ScoreDoc[] hits = collector.topDocs().scoreDocs;

        //4.display results
        System.out.println("Found "+ hits.length + " hits");
        for(int i=0;i<hits.length;i++){
            int docId = hits[i].doc;
            Document document = searcher.doc(docId);
            System.out.println((i+1)+"."+document.get("isbn")+"\t"+document.get("title"));
        }
        reader.close();
    }

    /**
     * @param writer
     * @param title
     * @param isbn
     * @throws IOException
     */
    public static void addDoc(IndexWriter writer,String title,String isbn) throws IOException{
        Document document = new Document();
        //不同的Field 加入到文档,需要分词的内容使用textField,不需要分词的内容使用stringField
        document.add(new TextField("title",title, Field.Store.YES));
        document.add(new StringField("isbn",isbn,Field.Store.YES));
        //IndexWriter 调用函数addDocument 将索引写到索引文件夹中
        writer.addDocument(document);
    }
}

