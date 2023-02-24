public class Fraction{
    int num;
    int denom;
    Fraction(int a, int b){
        this.num = a; this.denom = b;
    }
    public Fraction Multiply(Fraction a){
        int d = this.denom * a.denom;
        int n = this.num * a.num;
        Fraction one = new Fraction(n,d);
        return (one);
    }
    public Fraction Divide(Fraction z){
        int d = this.denom * z.num;
        int n = this.num * z.denom;
        Fraction one = new Fraction(n,d);
        return (one);
    }
    public Fraction Add(Fraction b){
        int d = this.denom * b.denom;
        int n = ((int)(d*this.num)/this.denom)+((int)(d*b.num)/b.denom);
        Fraction two = new Fraction(n,d);
        return (two);
    }
    public Fraction Subtract(Fraction c){
        int d = this.denom * c.denom;
        int n = ((int)(d*this.num)/this.denom)-((int)(d*c.num)/c.denom);
        Fraction two = new Fraction(n,d);
        return (two);
    }
    public  int Min(int a, int b){
        if (a>b){
            return b;
        }
        return a;
    }
    public Fraction Simplify(){
        int n=this.num,d=this.denom;
        int less = Min(this.num,this.denom);
        for (int i=1;i<=less;i++){
            if ((this.num%i==0)&&(this.denom%i==0)){
                n = (int)this.num/i;
                d = (int)this.denom/i;
            }
        }
        Fraction fee = new Fraction(n,d);
        return fee;

    }
    public String toString(){
        if (this.denom != 1){
            return (this.num+"/"+this.denom);
        }
        return this.num +" ";

    }
    public static void main(String args[]){
        Fraction c = new Fraction(3, 2);
        System.out.println("c = "+c);
        Fraction d = new Fraction(1, 7);
        Fraction e,f;
        System.out.println("d = "+ d);
        e = c.Add(d);
        System.out.println(">>Add: " +c+" +"+d+" = "+ e);
        System.out.println(e);
        f=e;
        e=((c.Subtract(d)).Add(e)).Simplify();
        System.out.println(">>Result: " +c+" - "+d+" + "+e+" = "+ e);
        e=e.Add(c.Add(d));
        System.out.println(">>Result: " +e+" + ("+c+" + "+d+") = "+ e);
        e = c.Multiply(d);
        System.out.println(">>Multiplication: " +c+" * "+d+" = "+ e);
        e = c.Divide(d);
        System.out.println(">>Division: " +c+" / "+d+" = "+ e);
        Fraction frac = new Fraction(588,196);
//        f = e.Multiply(frac);
//        System.out.println(f);
//        Fraction g = f.Simplify();
        System.out.println(frac.Simplify());


    }


}
