#include<stdio.h>
int main()
{
  int lenght,breadth,perimeter,area;
  lenght=6;
  breadth=9;
  perimeter=2*(lenght+breadth);
  area=lenght*breadth;
  printf("The perimeter of the rectangle is: %d cm\n",perimeter);
  printf("The area of the rectangle is: %d sq cm",area);
   return 0;
}