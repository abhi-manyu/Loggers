package org.logging.example.beans;

public class HelloWorld
{
   private String msg;
   public HelloWorld() {
	// TODO Auto-generated constructor stub
    }
   public String getMsg() {
	return msg;
}
   public void setMsg(String msg) {
	this.msg = msg;
}
   public void display()
   {
	   System.out.println(msg);
   }
}
