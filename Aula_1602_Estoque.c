#include <stdio.h>

int main()
{
    char produto [100]; 
    float a,b,c,lr,tr,vmd,emin,emax,ea; 
    
    printf("Bem-vindo ao nosso sistema de mercadorias! Digite o produto desejado:\n"); 
    gets(produto); 
    
    fflush(stdin); 
    
    printf("Prosseguindo com o sistema, digite o primeiro mes:\n");
    scanf("%f", &a);
    
    printf("Digite o segundo mes:\n");
    scanf("%f", &b);
    
    printf("Digite o terceiro mes:\n");
    scanf("%f", &c);
    
    vmd= ((a+b+c)/3)/25; 
    
    printf("Otimo! Revelando os resultados das informacoes aplicadas:\n");
    printf("Produto escolhido: %s \n", produto);
    printf("A venda media diaria: %.2f\n", vmd);
    
    printf("Para completar com o nosso estoque, digite o tempo de reposicao:\n");
    scanf("%f", &tr); 
    
    emin= (vmd*tr);
    printf("Estoque minimo: %.2f \n", emin);
    
    printf("Agora digite o lote de reposicao:\n");
    scanf("%f", &lr); 
    
    emax= emin+lr; 
    
    printf("O estoque maximo: %.2f\n", emax);
    
    printf("Para finalizarmos e sabermos o que deve ou nao deve repor, digite o estoque atual:\n");
    scanf("%f", &ea); 
    
    if(ea>=emin){
        printf("Nao comprar!\n");
    } else {
        printf("Comprar!\n");
    }

    return 0;
}
