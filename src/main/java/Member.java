public class Member
{

    int age, salary;//Class Member variables
    String name;
    Member(String name,int age,int salary)
    {
        this.name=name;//Member variable initialization
        this.age=age;
        this.salary=salary;
        System.out.println("Member Name:"+name);
        System.out.println("Member Age:"+age);
        System.out.println("Member Salary:"+salary);


    }

}

class MemberVariable
{

    public static void main(String args[])
    {
        Member obj=new Member("Harry Potter",22,22000);//Creating class object

    }
}
