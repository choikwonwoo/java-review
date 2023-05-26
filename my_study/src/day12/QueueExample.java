package day12;
import java.util.*;
public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQue = new LinkedList<Message>();
		messageQue.offer(new Message("a","123"));
		messageQue.offer(new Message("b","456"));
		
		while(messageQue.isEmpty()) {
			Message message = messageQue.poll();
			switch(message.command) {
			case "a":
				System.out.println(message.to);
				break;
			case "b":
				System.out.println(message.to);
			}
		}
	}
	
	public static class Message {
		public String command;
		public String to;
		
		public Message(String command, String to) {
			this.command = command;
			this.to = to;
		}
	}
}