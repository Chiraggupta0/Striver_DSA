class student
{
    int rollno;
    String name;
    int marks;
}

public class arrayofobjects
{
    public static void main(String args[])
    {
        student s1=new student();
        s1.rollno=1;
        s1.name="chirag";
        s1.marks=88;

        student s2=new student();
        s2.rollno=2;
        s2.name="manya";
        s2.marks=99;

        student s3=new student();
        s3.rollno=3;
        s3.name="anuj";
        s3.marks=90;

        student students[]=new student[3];
        // here students[] is an array in which we store s1 at 0 index and so on
        students[0]= s1;
        students[1]= s2;
        students[2]= s3;
        

        for(int i=0;i<students.length;i++)
        {
            System.out.println(students[i].name+";"+students[i].marks+";"+students[i].rollno);
        }
    }
}