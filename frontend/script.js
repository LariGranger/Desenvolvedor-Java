async function buscarEndereco() {
    const cep = document.getElementById('cep').value;
    if(!cep){
        alert('Digitar um CEP correto!');
    }
    try{
        const resposta = await fetch(`https://viacep.com.br/ws/${cep}/json/`);
        const dados = await resposta.json();

        document.getElementById('dados_cep').textContent = dados.cep;
        document.getElementById('dados_logradouro').textContent = dados.logradouro;
        document.getElementById('dados_bairro').textContent = dados.bairro;
    }catch(err){
        document.getElementById('dados').textContent = 'Erro';
    }
}