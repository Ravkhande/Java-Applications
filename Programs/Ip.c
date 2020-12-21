// a.b.c.d
// 127.43.23.109

#include<stdio.h>
#include<stdlib.h>

/*
    no1     0   0   0   A
    no2     0   0   0   B
    no3     0   0   0   C
    no4     0   0   0   D
 
    IP       A    B     C      D
 */
int FormIP(int no1, int no2, int no3, int no4)
{
    int ret = 0;
    
    no1 = no1 & 0x000000ff;
    no2 = no2 & 0x000000ff;
    no3 = no3 & 0x000000ff;
    no4 = no4 & 0x000000ff;
    
    no1 = no1 << 24;
    no2 = no2 << 16;
    no3 = no3 << 8;
    
    ret = no1 | no2 | no3 | no4;
    
    return ret;
}

void SplitIP(int no) 
{
    int a,b,c,d;
    a = no & 0xff000000;
    b = no & 0x00ff0000;
    c = no & 0x0000ff00;
    d = no & 0x000000ff;
    
    a = a >> 24;
    b = b >> 16;
    c = c >> 8;
    // skip d
    
    printf("First number : %d\n",a);
    printf("Second number : %d\n",b);
    printf("Third number : %d\n",c);
    printf("Fourth number : %d\n",d);
}

int main()
{
    int a = 0,b = 0,c = 0,d = 0;
    int iRet = 0;
    
    printf("Enter IP Address\n");
    
    printf("First value : ");
    scanf("%d",&a);
    
    printf("\nSecond value : ");
    scanf("%d",&b);
    
    printf("\nThird value : ");
    scanf("%d",&c);
    
    printf("\nFourth value : ");
    scanf("%d",&d);
    
    iRet = FormIP(a,b,c,d);
    printf("\nIP address in one integer is : %d\n",iRet);
    
    SplitIP(iRet);
    
    return 0;
}
