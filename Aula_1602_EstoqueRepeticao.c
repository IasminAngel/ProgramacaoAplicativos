#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "portuguese");

    char produtos[4][100];
    int i, y;
    float quantia, somativa, vmd, tr[4], emin, lr[4], emax, ea[4];

    printf("Bem-vindo ao estoque! Para sabermos o andamento, ser solicitado informaçõees importantes para prosseguimento. \n");

    for (i = 0; i < 4; i++)
    {
        printf("Lista dos produtos - %dº produto: \n", i + 1);
        fflush(stdin);
        gets(produtos);

        for (y = 0; y < 3; y++)
        {
            printf("Quais foram a quantia de cada produto dentro de três meses ? Responda em sequência: \n", i + 1);
            scanf("%f", &quantia);
            somativa += quantia;
            vmd = (somativa / 3) / 25;
        }

        printf("Ótimo! Revelando os resultados das informacoes aplicadas:\n");
        printf("Produtos escolhidos: %s \n", produtos);
        printf("A venda media diaria: %.2f\n", vmd);

        printf("Para completar com o nosso estoque, digite o tempo de reposicao:\n");
        scanf("%f", &tr[4]);

        emin = (vmd * tr[4]);

        printf("Resultado do estoque mínimo: %.2f \n", emin);

        printf("Para prosseguirmos, precisamos do lote de reposição:\n");
        scanf("%f", &lr[4]);

        emax = emin + lr[4];

        printf("O estoque máximo: %.2f\n", emax);

        printf("Para finalizarmos e sabermos o que deve ou nao deve repor, digite o estoque atual:\n");
        scanf("%f", &ea[4]);

        if (ea[4] >= emin)
        {
            printf("Não comprar!\n");
        }
        else
        {
            printf("Comprar!\n");
        }

    }
        return 0;
}
