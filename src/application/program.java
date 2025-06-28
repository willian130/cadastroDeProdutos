package application;

import product.Produto;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("quantos produtos voçê deseja cadastrar?");
        int quantity = sc.nextInt();
        sc.nextLine();
        Set<Produto> produtos = new HashSet<>();

        for (int i = 1; i <= quantity; i ++) {

            System.out.println("digite os dados do produto" + i + ":");

            System.out.println("DIgite o nome: ");
            String name = sc.nextLine();

            System.out.println("DIgite o código: ");
            String code = sc.nextLine();

            System.out.println("Digite o preço do produto: ");
            double price = sc.nextDouble();
            sc.nextLine();

            Produto produto = new Produto(name, code, price);

            if (produtos.contains(produto)) {
                System.out.println("Erro: Já existe um produto com esse código!");
            } else {
                produtos.add(produto);
                System.out.println("Produto adicionado com sucesso.");
            }
        System.out.println();
        }
        System.out.println("Produtos cadastrados");
         for (Produto p : produtos) {
             System.out.println(p);
         }
        sc.close();
         }

    }
