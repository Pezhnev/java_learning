package ru.stqa.learn.sandbox;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.Message;
import javax.jms.Queue;
import org.apache.activemq.ActiveMQConnectionFactory;



public class JmsClientMessageSender {

  public static void main(String[] args) {
    ConnectionFactory factory = new ActiveMQConnectionFactory("tcp://localhost:61616");
    Connection con = null;
    try {
      con = factory.createConnection();
      Session session = con.createSession(false, Session.AUTO_ACKNOWLEDGE);

      Queue queue = session.createQueue("test3.queue");

      MessageProducer producer = session.createProducer(queue);
      Message msg = session.createTextMessage(
              "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
              "<company>\n" +
              "    <name>IT</name>\n" +
              "    <offices>\n" +
              "        <office floor=\"1\" room=\"1\">\n" +
              "            <employees>\n" +
              "                <employee>\n" +
              "<firstname>Maksim</firstname>\n" +
              "<lastname>Pezhnev</lastname>\n" +
              "<midlename>Anatolievich</midlename>\n" +
              "<id>1</id>\n" +
              "                </employee>\n" +
              "<employee>\n" +
              "<firstname>Alex</firstname>\n" +
              "<lastname>Wan</lastname>\n" +
              "<midlename>Anato</midlename>\n" +
              "<id>2</id>\n" +
              "                </employee>\n" +
              "                <employee>\n" +
              "<firstname>Serg</firstname>\n" +
              "<lastname>Man</lastname>\n" +
              "<midlename>Anato</midlename>\n" +
              "<id>3</id>\n" +
              "                </employee>\n" +
              "             </employees>\n" +
              "        </office>\n" +
              "    </offices>\n" +
              "</company>");
      producer.send(msg);

    } catch (JMSException e) {
      e.printStackTrace();
    } finally {
      if (con != null) {
        try {
          con.close();
        } catch (JMSException e) { /* Ignore */ }
      }
    }
  }
}
