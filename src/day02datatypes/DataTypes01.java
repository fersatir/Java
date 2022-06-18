package day02datatypes;

public class DataTypes01 {
    public static void main(String[] args) {
        /*
       What is the difference between "primitive" and "non-primitive" data types?
       1)primitive data types contain just values, non-primitive data types contain value+method
       2)primitive data types names use just lowercase characters, but non-primitive data type names use uppercase at the beginning
       3)primitive data types were created by java, developers can not create primitive data types.
       But non-primitive data types can be created by Java and by any developer
       4)non-primitive data types use same size area in memory but primitive data types use different size area in memory.
        */

        //primitive data types:boolean,char,byte,short,int,long,float,double
        //1) boolean: boolean has 2 values which are true or false. A boolean variable uses just a bit in the memory
        boolean isRetired = false;
        boolean isOld = true;
        //2)char: char is for just a single character.It uses 16 bits(2 bytes) in memory

        char initial ='A';
        //3)byte: byte is for whole numbers between -128 and 127.It uses 8 bits(1 byte)in memory
        byte age = 14;
        byte mathGrade = 76;

        //4)short: short is for whole numbers between -32768 and 32767.It uses 16 bits(2 byte) in memory
        short numberOfStudentInASchool = 2134;

        //5)int: int is for whole numbers between -2,147,483,648 and 2,147,483,647.It uses 32 bits(4 bytes) in memory
        int annualProfitOfApple = 2000000000;

        //6)long:Long is for whole numbers between -9,223,372,636,854,755,898 and 9,223,372,636,854,755,897.It uses 64 bits(8 bytes) in memory
        // Do not forget to put "L" to the end of the value in the long data type
        long populationProfitOfTheWorld = 700000000L;

        //7)float: float is for decimals.It uses 32 bits in memory.
        //Do no forget to put "F" or "f" to the end of the value in float data type
        //In float, decimal part can have up to 7 digits
        float priceOfShirt = 12.99f;

        //8)double: double is for decimals. It uses 64 bits in memory.
        //In double, decimal part can contain up to 16 digits
        double weightOfACell =0.00001230004;




        //Non-primitive Data:String
        String s = "Ali";
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //Create a char variable and print it on the console
        //Every character has an integer value in IT area.Those values are called ASCII values
        //Note: If you use any char in mathematical operation, Java uses its ASCII value in the operation
        char c ='A';
        System.out.println(c+1);//66

        //Type  code to find the ASCII Value of "!"
        char e = '!';
        System.out.println(e + 0);

        //Type code to find the sum of the ASCII Values of 'X' and 'y' and '?'
        char a='X', b='y',d='?';
        System.out.println(a+b+d); //272

        //Create 2 integer variables whose values are 5 and 2 then print the result of first is divided by second
        //If you use just "int" data type in mathematical operations the result will be in "int" data type.
        //In the result, Java will remove decimal part and return just the whole part
        int i = 5, k = 2;
        System.out.println(i/k);

        //When you use different data types in mathematical operations, the result will be in the largest type.
        //Because of that the result data type will be double.
        double m = 5;
        int n = 2;
        System.out.println(m/n);

        //In how many ways you can fix the following issue?
        //1.way:
        float z = 2.5F;
        //2.way:
        double r = 2.5;

        //What is the output of the followings?
        System.out.println(2+3+"Ali");//5Ali

        System.out.println(2+'a'+"B"+(3+4)); //99B7
        //'a' char=97  it came from ASCCI table


    }
}
