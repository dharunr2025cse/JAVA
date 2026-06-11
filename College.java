class Details{
    int regNo=13;
    String studentName="Karthi";
    Double percentage=100.00;
    Details(int rNo,String name){
      this.regNo=rNo;
      this.studentName=name;
    }
    Details(int rNo,String name,Double percentage){
      this.regNo=rNo;
      this.studentName=name;
      this.percentage=percentage;
    }
    void display(){
        System.out.println("Student Name:"+studentName);
        System.out.println("Student Register No:"+regNo);
        System.out.println("Student percentage:"+percentage);    
    }
}   class College{
    public static void main(String[] args){
        Details s1=new Details(10,"Dharun",93.55);
        Details s2=new Details(12,"Bharat",84.88);
        s1.display();
        s2.display();
     }
}