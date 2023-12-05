package com.multi.mvc01;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class Mongo3 {
    public static void main(String[] args) {
        try {
            //1.mongoDB연결할 수 있는 클라이언트 객체 생성
            MongoClient client = new MongoClient("localhost", 27017);
            System.out.println("1. mongoserver연결");

            //2.db에 연결
            MongoDatabase database = client.getDatabase("shop2");
            System.out.println("2. shop2 mongodb연결");

            //3.memo 컬렉션에 연결
            MongoCollection<Document> collection = database.getCollection("memo");
            System.out.println("3. memo 컬렉션에 연결");

            //4.insert할 document객체 생성
            Document doc = new Document(); //JSON {id: "apple", pw: "apple", .....}
            doc.append("age", 20);
            doc.append("name", "apple");
            doc.append("office", "appleOffice");
            doc.append("phone", "010-1111-1111");
            System.out.println("4. insert할 document객체 생성");

            //5.mongoDB로 전송
            collection.insertOne(doc);
            client.close(); //
            System.out.println("5. mongoDB로 전송 ");
        }catch(Exception e) {
            e.printStackTrace();
        }
    }
}
