# Implementation of a Lexical Analyzer for C Language Compiler
## Input T1
int main(){
int a=5,7H;
//assign value
char b='x';
/*return value*/
return a+b;
}
## Output T1
![image](https://github.com/user-attachments/assets/41524664-a167-41e6-b40e-b7ba33ef1d58)

## Input T2
void main( )
{
long int bs , da , hra , gs;
//take basic salary as input
scanf("%ld",&bs);
//calculate allowances
da=bs*.40;
hra=bs*.20;
gs=bs+da+hra;
// display salary slip
printf("\n\nbs : %ld",bs);
printf("\nda : %ld",da);
printf("\nhra : %ld",hra);
printf("\ngs : %ld",gs);
}

## Output T2
![image](https://github.com/user-attachments/assets/e74ddb6e-a8c9-4764-b21b-1fa30f2f7668)

## Input T3
// user defined data type
struct student
{
int id;
float cgpa;
}
void main( )
{
student s;
s.id = 10;
s.cgpa = 8.7;
}

## Output T3
![image](https://github.com/user-attachments/assets/af2a0b59-363f-45e1-b9e7-d86237fa218a)

## Input T3
//function prototype
void add ( int , int );
void main( )
{
int a , b;
a = 10;
b = 20;
// function call
add ( a , b );
}
void add ( int x , int y )
{
return x + y;
}

# Output T3
![image](https://github.com/user-attachments/assets/72b92b1c-230f-474b-b438-863bb1df4af1)

