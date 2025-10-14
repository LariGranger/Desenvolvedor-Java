/*Atividade 2: Controle de Estoque de Produtos*/

class atvControleEstoque {
    /*Desenvolva uma classe Produto com:
    ● Atributos privados:
    1. nome (String)
    2. codigo (String)
    3. quantidade (int)
    4. precoUnitario (double)*/
    private String nome;
    private String codigo;
    private int quantidade;
    private int precoUnitario;


    /* ● Métodos:
    1. Construtor padrão
    2. Construtor com todos os parâmetros
    3. Métodos getters e setters
    4. Método adicionarEstoque(int quantidade) que incremente a
    quantidade
    5. Método removerEstoque(int quantidade) que decremente a
    quantidade */

    public atvControleEstoque(String nome, String codigo, int quantidade, int precoUnitario){
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome(){
        return nome;
    }

    public String getCodigo(){
        return codigo;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getPrecoUnitario(){
        return precoUnitario;
    }

    public void setNome(String nome) { 
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome inválido!");
        }
    }

    public void setCodigo(String codigo) { 
        if (codigo != null && !codigo.isEmpty()) {
            this.codigo = codigo;
        } else {
            System.out.println("Código inválido!");
        }
    }

}

class controleProdutos {
    public static void main(String[] args) {
    /* ● Crie um programa com menu do-while para:
    1. Cadastrar novo produto
    2. Adicionar estoque
    3. Remover estoque
    4. Calcular valor total do estoque
    5. Sair do programa */
    }
}