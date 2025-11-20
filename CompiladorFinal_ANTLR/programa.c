#include <stdio.h>

#include <stdlib.h>


int main() {
  int fatorial;
  int parametro;
    scanf("%d", &parametro);
    fatorial = (parametro);
    
 if (parametro==0) {
    fatorial = (1);
}
    while (parametro>1) {
    fatorial = (fatorial*(parametro-1));
    parametro = (parametro-1);
}
    printf("%d\n", fatorial);
   
 return 0;
}
