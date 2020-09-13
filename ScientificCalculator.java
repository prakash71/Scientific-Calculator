import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ScientificCalculator extends JFrame implements ActionListener {
    JTextField tfield;
    double temp, temp1, result, a,q;
    int k = 1, x = 0, y = 0, z = 0;
    char ch;
JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, zero, clr, pow2, pow3, exp,
    fac, plus, min, div, log, rec, mul, eq, dot,
        sqrt, sin, cos, tan,sinh,cosh,pow,ln,ncr;
Container cont;
JPanel textPanel, buttonpanel;

ScientificCalculator() {
cont = getContentPane();
cont.setLayout(new BorderLayout());
JPanel textpanel = new JPanel();
tfield = new JTextField(25);

tfield.setHorizontalAlignment(SwingConstants.RIGHT);
textpanel.add(tfield);
buttonpanel = new JPanel();
buttonpanel.setLayout(new GridLayout(8,4));

b1 = new JButton("1");
buttonpanel.add(b1);
b1.addActionListener(this);
b2 = new JButton("2");
buttonpanel.add(b2);
b2.addActionListener(this);
b3 = new JButton("3");
buttonpanel.add(b3);
b3.addActionListener(this);


plus = new JButton("+");
buttonpanel.add(plus);
plus.addActionListener(this);


b4 = new JButton("4");
buttonpanel.add(b4);
b4.addActionListener(this);
b5 = new JButton("5");
buttonpanel.add(b5);
b5.addActionListener(this);
b6 = new JButton("6");
buttonpanel.add(b6);
b6.addActionListener(this);

min = new JButton("-");
buttonpanel.add(min);
min.addActionListener(this);

b7 = new JButton("7");
buttonpanel.add(b7);
b7.addActionListener(this);
b8 = new JButton("8");
buttonpanel.add(b8);
b8.addActionListener(this);
b9 = new JButton("9");
buttonpanel.add(b9);
b9.addActionListener(this);

mul = new JButton("*");
buttonpanel.add(mul);
mul.addActionListener(this);


zero = new JButton("0");
buttonpanel.add(zero);
zero.addActionListener(this);

dot = new JButton(".");
buttonpanel.add(dot);
dot.addActionListener(this);


eq = new JButton("=");
buttonpanel.add(eq);
eq.addActionListener(this);



div = new JButton("/");
div.addActionListener(this);
buttonpanel.add(div);




rec = new JButton("1/x");
buttonpanel.add(rec);
rec.addActionListener(this);
sqrt = new JButton("Sqrt");
buttonpanel.add(sqrt);
sqrt.addActionListener(this);
log = new JButton("log");
buttonpanel.add(log);
log.addActionListener(this);
ln = new JButton("ln");
buttonpanel.add(ln);
ln.addActionListener(this);

sin = new JButton("SIN");
buttonpanel.add(sin);
sin.addActionListener(this);
sinh = new JButton("SINH");
buttonpanel.add(sinh);
sinh.addActionListener(this);
cos = new JButton("COS");
buttonpanel.add(cos);
cos.addActionListener(this);
cosh = new JButton("COSH");
buttonpanel.add(cosh);
cosh.addActionListener(this);
tan = new JButton("TAN");
buttonpanel.add(tan);
tan.addActionListener(this);
pow = new JButton("^");
buttonpanel.add(pow);
pow.addActionListener(this);
pow2 = new JButton("x^2");
buttonpanel.add(pow2);
pow2.addActionListener(this);
pow3 = new JButton("x^3");
buttonpanel.add(pow3);
pow3.addActionListener(this);
exp = new JButton("Exp");
exp.addActionListener(this);
buttonpanel.add(exp);
fac = new JButton("n!");
fac.addActionListener(this);
buttonpanel.add(fac);


ncr = new JButton("ncr");
buttonpanel.add(ncr);
ncr.addActionListener(this);
clr = new JButton("AC");
buttonpanel.add(clr);
clr.addActionListener(this);
 cont.add("Center", buttonpanel);
 cont.add("North", textpanel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public void actionPerformed(ActionEvent e) {
String s = e.getActionCommand();
if (s.equals("1"))
{
tfield.setText(tfield.getText() + "1");
}
      
if (s.equals("2")) {
tfield.setText(tfield.getText() + "2");
}
if (s.equals("3")) {
 tfield.setText(tfield.getText() + "3");
}
if (s.equals("4")) {
           tfield.setText(tfield.getText() + "4");
}
if (s.equals("5")) {
            tfield.setText(tfield.getText() + "5");
}
if (s.equals("6")) {
              tfield.setText(tfield.getText() + "6");
}
if (s.equals("7")) {
             tfield.setText(tfield.getText() + "7");
}
if (s.equals("8")) {
             tfield.setText(tfield.getText() + "8");
}
if (s.equals("9")) {
            tfield.setText(tfield.getText() + "9");
}
if (s.equals("0")) {
 tfield.setText(tfield.getText() + "0");
}
if (s.equals("AC")) {
        tfield.setText("");
         x = 0;
        y = 0;
        z = 0;
}
if (s.equals("log")) {
    if (tfield.getText().equals("")){
     tfield.setText("");
} else {
          a = Math.log10(Double.parseDouble(tfield.getText()));
                        z=Integer.parseInt(tfield.getText());
                            tfield.setText("");
                     tfield.setText("log"+z+"="+tfield.getText() + a);}
}
if (s.equals("ln")) {
        if (tfield.getText().equals("")){
         tfield.setText("");
           } else {
              a = Math.log(Double.parseDouble(tfield.getText()));
              z=Integer.parseInt(tfield.getText());
               tfield.setText("");
                tfield.setText("ln"+z+"="+tfield.getText() + a);}
}
if (s.equals("1/x")) {
   if (tfield.getText().equals("")) {
   tfield.setText("");
  } else { 
           a = 1 / Double.parseDouble(tfield.getText());
              z=Integer.parseInt(tfield.getText());
          tfield.setText("");
          tfield.setText("1/"+z+"="+tfield.getText() + a);
 }
}
if (s.equals("Exp")) {
      if (tfield.getText().equals("")) {
        tfield.setText("");
        } else {
          a = Math.exp(Double.parseDouble(tfield.getText()));
        z=Integer.parseInt(tfield.getText());
     tfield.setText("");
       tfield.setText("exp"+z+"="+tfield.getText() + a);}
}
if (s.equals("x^2")) 
    if (tfield.getText().equals("")) {
        tfield.setText("");
          } else {
    a = Math.pow(Double.parseDouble(tfield.getText()), 2);
          z=Integer.parseInt(tfield.getText());
       tfield.setText("");
        tfield.setText(z+"^2"+"="+tfield.getText() + a);
 }
}
if (s.equals("x^3")) {
       if (tfield.getText().equals("")) {
      tfield.setText("");
        } else {
         a = Math.pow(Double.parseDouble(tfield.getText()), 3);
            z=Integer.parseInt(tfield.getText());
     tfield.setText("");
        tfield.setText(z+"^3"+"="+tfield.getText() + a);
 }
}

if (s.equals(".")) {
         if (y == 0) {
          tfield.setText(tfield.getText() + ".");
        y = 1;
      } else {
       tfield.setText(tfield.getText());
  }
}
if (s.equals("+")) {
         if (tfield.getText().equals("")) {
     tfield.setText("");
    temp = 0;
      ch = '+'; 
   } else {
temp = Double.parseDouble(tfield.getText());
 tfield.setText("");
ch = '+';
}
}
 if (s.equals("^")) {
  if (tfield.getText().equals("")) {
   tfield.setText("");
      temp = 0;
      ch = '^'; 
       } else {
          temp = Double.parseDouble(tfield.getText());
                 tfield.setText("");
               ch = '^';
          }
}
if (s.equals("-")) {
         if (tfield.getText().equals("")) {
       tfield.setText("");
         temp = 0;
            ch = '-';
               } else {
             temp = Double.parseDouble(tfield.getText());
              tfield.setText("");
             ch = '-';
 }
}
if (s.equals("/")) {
        if (tfield.getText().equals("")) {
           tfield.setText("");
         temp = 1;
       ch = '/';
       } else{
      temp = Double.parseDouble(tfield.getText());
     ch = '/';
       tfield.setText("");
}
}
if (s.equals("*")) {
        if (tfield.getText().equals("")) {
    tfield.setText("");
     temp = 1;
      ch = '*';
  } else {
      temp = Double.parseDouble(tfield.getText())
      ch = '*';
      tfield.setText("");    
 }
}
if (s.equals("ncr")) {
  if (tfield.getText().equals("")) {
tfield.setText("");
                  temp = 1;
         ch  = 'c';
} else {
         temp = Double.parseDouble(tfield.getText());
          ch = 'c';
         tfield.setText("");
    }
}
if (s.equals("Sqrt")) {
      if (tfield.getText().equals("")) {
     tfield.setText("");
     } else {
         a = Math.sqrt(Double.parseDouble(tfield.getText()));
     q=Double.parseDouble(tfield.getText());
       tfield.setText("");
        tfield.setText("sqrt"+q+"="+tfield.getText() + a);
}
}
if (s.equals("SIN")) {
      if (tfield.getText().equals("")) {
       tfield.setText("");
       } else {
       a = Math.sin(Double.parseDouble(tfield.getText()));
       q=Double.parseDouble(tfield.getText());
         tfield.setText("");
        tfield.setText(tfield.getText()+"sin"+q+"="+a);
}
}
if (s.equals("SINH")) {
      if (tfield.getText().equals("")) {
 tfield.setText("");
     } else {
       a = Math.sinh(Double.parseDouble(tfield.getText()));
      q=Double.parseDouble(tfield.getText());
       tfield.setText("");
       tfield.setText("sinh"+q+"="+tfield.getText()+a );
 }
}
if (s.equals("COS")) {
    if (tfield.getText().equals("")) {
     tfield.setText("");
} else {
      a = Math.cos(Double.parseDouble(tfield.getText()));
      q=Double.parseDouble(tfield.getText());
     tfield.setText("");
         tfield.setText("cos"+q+"="+tfield.getText() + a);
 }
}
if (s.equals("COSH")) {
        if (tfield.getText().equals("")) {
       tfield.setText("");
      } else {
      a = Math.cosh(Double.parseDouble(tfield.getText()));
       q=Double.parseDouble(tfield.getText());
      tfield.setText("");
 tfield.setText("cosh"+q+"="+tfield.getText() + a);}
}
if (s.equals("TAN")) {
         if (tfield.getText().equals("")) {
      tfield.setText("");
    } else {
          a = Math.tan(Double.parseDouble(tfield.getText()));
          q=Double.parseDouble(tfield.getText());
         tfield.setText("");
           tfield.setText("tan"+q+"="+tfield.getText() + a);}
}
if (s.equals("=")) {
    if (tfield.getText().equals("")){
     tfield.setText("");
 } else {
           temp1 = Double.parseDouble(tfield.getText());
          switch (ch) {
       case '+': result = temp + temp1;
    break;
   case '-':
       result = temp - temp1;
         break;
      case '/':
          result = temp / temp1;
          break;
       case '*':
         result = temp * temp1;
         break;
         case '^':
           result = Math.pow(temp,temp1);
          break;        
         case 'c':
            result = fact(temp)/(fact(temp1)*fact(temp-temp1));
            break;    
}
 tfield.setText("");
  tfield.setText(tfield.getText()+temp+ch+temp1+"=" + result);}
}
if (s.equals("n!")) {
if (tfield.getText().equals("")) {
    tfield.setText("");
       } else {
       a = fact(Double.parseDouble(tfield.getText()));
       z=Integer.parseInt(tfield.getText());
        tfield.setText("");
          tfield.setText("factorial of "+z+" is  "+tfield.getText() + a);}
}
}
double fact(double x) {
int er = 0;
if (x < 0) {
er = 20;
return 0;
}
double i, s = 1;
for (i = 1 ;i <= x; i ++)
s *= i;
return s;
}

public static void main(String args[]) {

ScientificCalculator f = new ScientificCalculator();
f.setTitle("ScientificCalculator");
f.pack();
f.setVisible(true);
}
}                
