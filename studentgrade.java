import java.awt.*;
import java.awt.event.*;
class studentgrade extends Frame implements ActionListener{

Label l1,l2,l3,l4,l5,l6,l7,l8;
TextField t1,t2,t3,t4,t5,t6,t7,t8;

public studentgrade(){

l1=new Label("Tamil:");
l1.setBounds(40,100,100,20);
t1=new TextField();
t1.setBounds(150,100,100,20);


l2=new Label("English:");
l2.setBounds(40,140,100,20);
t2=new TextField();
t2.setBounds(150,140,100,20);

l3=new Label("Maths:");
l3.setBounds(40,180,100,20);
t3=new TextField();
t3.setBounds(150,180,100,20);

l4=new Label("Science:");
l4.setBounds(40,220,100,20);
t4=new TextField();
t4.setBounds(150,220,100,20);

l5=new Label("Social:");
l5.setBounds(40,260,100,20);
t5=new TextField();
t5.setBounds(150,260,100,20);



l6=new Label("Total Marks: ");
l6.setBounds(270,100,100,20);
t6=new TextField();
t6.setBounds(370,100,100,20);

l7=new Label("Percentage: ");
l7.setBounds(270,140,100,20);
t7=new TextField();
t7.setBounds(370,140,100,20);

l8=new Label("Grade: ");
l8.setBounds(270,180,100,20);
t8=new TextField();
t8.setBounds(370,180,100,20);

Button b=new Button("Calculate");
b.setBounds(200,400,70,50);
b.addActionListener(this);

add(l1);
add(l2);
add(l3);
add(l4);
add(l5);
add(l6);
add(l7);
add(l8);
add(t1);
add(t2);
add(t3);
add(t4);
add(t5);
add(t6);
add(t7);
add(t8);
add(b);

setSize(500,500);
setLayout(null);
setVisible(true);
setTitle("Student Grade Calculator"); 

this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
});


}
public void actionPerformed(ActionEvent e){

int n1=Integer.parseInt(t1.getText());
int n2=Integer.parseInt(t2.getText());
int n3=Integer.parseInt(t3.getText());
int n4=Integer.parseInt(t4.getText());
int n5=Integer.parseInt(t5.getText());

int sum=n1+n2+n3+n4+n5;
int avg=sum/5;
t6.setText(String.valueOf(sum));
t7.setText(String.valueOf(avg));

if(avg>90)
t8.setText("S");
else if(avg<=90 && avg>80)
t8.setText("A+");
else if(avg<=80 && avg>70)
t8.setText("A");
else if(avg<=70 && avg>60)
t8.setText("B");
else if(avg<=60 && avg>50)
t8.setText("C");
else if(avg<=50 && avg>40)
t8.setText("D");
else
t8.setText("F");

}

public static void main(String args[]){
new studentgrade();
}
}