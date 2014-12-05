package beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroTreinamentosBean {
	private String razaoSocial;
	private String cnpj;
	private String cidadeContrato;
	private String modalidade;
	private Date dataContrato;
	private String valorContrato;
	private String metodoPagamento;
	private String formaPagamento;
	private List<String> cursos = new ArrayList<>();

	private List<String> metodoPagamentoLista = new ArrayList<>();
	private List<String> formaPagamentoLista = new ArrayList<>();
	private List<String> cidadesLista = new ArrayList<>(); 
	
	

	public CadastroTreinamentosBean() {
		modalidade = "EAD";
		
		metodoPagamentoLista.add("cartão de crédito");
		metodoPagamentoLista.add("cheque");
		metodoPagamentoLista.add("boleto");
		
		cidadesLista.add("Rio de Janeiro");
		cidadesLista.add("Foz de Iguaçu");
		cidadesLista.add("São Paulo");
		cidadesLista.add("Florianópolis");
		cidadesLista.add("Salvador");
		cidadesLista.add("Balneário Camboriú");
		cidadesLista.add("Fortaleza");
		cidadesLista.add("Natal");
		cidadesLista.add("Armação dos Búzios");
		cidadesLista.add("Manaus");		
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public String getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(String valorContrato) {
		this.valorContrato = valorContrato;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public List<String> getCursos() {
		return cursos;
	}

	public void setCursos(List<String> cursos) {
		this.cursos = cursos;
	}

	public String getCidadeContrato() {
		return cidadeContrato;
	}

	public void setCidadeContrato(String cidadeContrato) {
		this.cidadeContrato = cidadeContrato;
	}

	public List<String> getMetodoPagamentoLista() {
		return metodoPagamentoLista;
	}

	public void setMetodoPagamentoLista(List<String> metodoPagamentoLista) {
		this.metodoPagamentoLista = metodoPagamentoLista;
	}

	public List<String> getFormaPagamentoLista() {
		return formaPagamentoLista;
	}

	public void setFormaPagamentoLista(List<String> formaPagamentoLista) {
		this.formaPagamentoLista = formaPagamentoLista;
	}

	public List<String> getCidadesLista() {
		return cidadesLista;
	}

	public void setCidadesLista(List<String> cidadesLista) {
		this.cidadesLista = cidadesLista;
	}

	public void cadastrar() {
		System.out.println("Razão Social: " + this.razaoSocial);
		System.out.println("CNPJ: " + this.cnpj);
		System.out.println("Modalidade: " + this.modalidade);
		System.out.println("Data do Contrato: " + this.dataContrato);
		System.out.println("Valor do Contrato: " + this.valorContrato);
		System.out.println("Método de Pagamento: " + this.metodoPagamento);
		System.out.println("Forma de Pagamento: " + this.formaPagamento);
		System.out.println("Cursos: " + this.cursos);
	}

	public List<String> sugerirCidades(String consulta) {
		List<String> cidadesSugeridas = new ArrayList<>();
		
		for (String cidade: this.cidadesLista) {
			if(cidade.toLowerCase().startsWith(consulta.toLowerCase())){
				cidadesSugeridas.add(cidade);
			}			
		}		
		return cidadesSugeridas;
	}
	
	public void carregarFormasPagamento(){
		formaPagamentoLista.clear();
		
		if("cartão de crédito".equals(this.metodoPagamento)){
			formaPagamentoLista.add("À vista");
			formaPagamentoLista.add("1x");
			formaPagamentoLista.add("2x");
			formaPagamentoLista.add("3x");
			formaPagamentoLista.add("4x");
			formaPagamentoLista.add("5x");
			formaPagamentoLista.add("6x");
		} else if("cheque".equals(this.metodoPagamento)){
			formaPagamentoLista.add("À vista");
			formaPagamentoLista.add("Entrada + 30 dias");
		}else if("boleto".equals(this.metodoPagamento)){
			formaPagamentoLista.add("À vista");
		}		
	}

}
