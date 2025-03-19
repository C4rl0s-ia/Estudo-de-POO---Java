package classes.contaBanco;

public class ContaBanco {

    public int numConta;
    protected String tipoConta; //Conta-corrente (CC) ou Conta Poupança (CP)
    private boolean status; //Conta aberta = true conta fechada = false
    private String titular;
    private double saldo;

    //Instanciando um número aleatório para o numConta no ato da criação.
    //private static final Random randomNumber = new Random();
    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
        //Sempre que o objeto conta for criada, será passada as informações atuais do objeto conta criada.
    }

    public void estadoAtual() {
        System.out.println("Número: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Nome: " + this.getTitular());
        System.out.println("Saldo: R$" + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("------------------------------");
    }

    public void abrirConta(String titular, String tipoConta) {
        //Verifica se o status é true
        if (isStatus()) {
            System.out.println("A conta já está aberta!");
            return;
        }

        this.setTitular(titular);
        this.setTipo(tipoConta);

        if (tipoConta.equalsIgnoreCase("cc")) {
            this.setSaldo(50);
            this.setStatus(true);
            System.out.println("------------------------------");
            System.out.println("Conta Aberta! Bem vindo ao CBC");
            System.out.println("Saldo adicionado a conta de R$50,00, nosso sinal de boas vindas! 😊");
            System.out.println("------------------------------");
        } else if (tipoConta.equalsIgnoreCase("cp")) {
            this.setStatus(true);
            this.setSaldo(150);
            System.out.println("------------------------------");
            System.out.println("Conta Aberta! Bem vindo ao CBC");
            System.out.println("Saldo adicionado de R$150,00, nosso sinal de boas vindas! 😊");
            System.out.println("------------------------------");
        } else {
            System.out.println("------------------------------");
            System.out.println("Nenhum tipo foi selecionado, por favor, tente novamente abrir sua conta.");
            System.out.println("------------------------------");
        }

    }

    public void fecharConta() {
        //Verifica se o status é false
        if (!this.isStatus()){
            System.out.println("------------------------------");
            System.out.println("Conta já está fechada!");
            System.out.println("------------------------------");
        }

        if (this.getSaldo() > 0) {
            System.out.println("------------------------------");
            System.out.println("Error: há saldo em sua conta");
            System.out.println("Saldo em conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        } else if (this.getSaldo() < 0) {
            System.out.println("------------------------------");
            System.out.println("Error: há débitos em sua conta");
            System.out.println("Saldo Negativo em conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        } else {
            this.setStatus(false);
            System.out.println("------------------------------");
            System.out.println("Conta fechada com sucesso!");
            System.out.println("------------------------------");
        }

    }

    public void depositar(double saldoDepositado) {
        if (!this.isStatus()){
            System.out.println("------------------------------");
            System.out.println("Conta está fechada. Impossível efetuar depósitos");
            System.out.println("------------------------------");
        } else {
            this.setSaldo(
                    this.getSaldo() + saldoDepositado
            );
            System.out.println("------------------------------");
            System.out.println("O saldo depositado de sua conta é: R$" + saldoDepositado);
            System.out.println("O saldo atual de sua conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        }

    }

    public void sacar(double saldoSacado) {
        if (!this.isStatus()){
            System.out.println("------------------------------");
            System.out.println("Conta está fechada. Impossível efetuar saques");
            System.out.println("------------------------------");
        }

        if (saldoSacado <= this.getSaldo()) {
            this.setSaldo(
                    this.getSaldo() - saldoSacado
            );
            System.out.println("------------------------------");
            System.out.println("O saldo sacado de sua conta é: R$" + saldoSacado);
            System.out.println("O saldo atual de sua conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        }

    }

    public void pagarMensal(){
        if (!this.isStatus()){
            System.out.println("------------------------------");
            System.out.println("Sem cobrança, conta fechada!");
            System.out.println("------------------------------");
        }

        if (this.getTipoConta().equalsIgnoreCase("cc")) {
            this.setSaldo(this.getSaldo() - 12);
            System.out.println("------------------------------");
            System.out.println("Taxa de manutenção. Saiu um total de: R$ 12,00");
            System.out.println("O saldo atual de sua conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        }

        if (this.getTipoConta().equalsIgnoreCase("cp")) {
            this.setSaldo(this.getSaldo() - 20);
            System.out.println("------------------------------");
            System.out.println("Taxa de manutenção. Saiu um total de: R$ 20,00");
            System.out.println("O saldo atual de sua conta é: R$" + this.getSaldo());
            System.out.println("------------------------------");
        }

    }

    //Métodos especiais
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipo(String tipo) {
        this.tipoConta = tipo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



}
