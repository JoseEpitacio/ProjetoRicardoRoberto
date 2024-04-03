import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ContaDeLuz {
    private int id;
    private Date dataLeitura;
    private String numLeitura;
    private Double qtdKw;
    private Double valorConta;
    private Date dataPagamento;
    private long difData;
    private Double mediaConsumo;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDataLeitura() {
        return dataLeitura;
    }
    public void setDataLeitura(Date dataLeitura) {
        this.dataLeitura = dataLeitura;
    }
    public String getNumLeitura() {
        return numLeitura;
    }
    public void setNumLeitura(String numLeitura) {
        this.numLeitura = numLeitura;
    }
    public Double getQtdKw() {
        return qtdKw;
    }
    public void setQtdKw(Double qtdKw) {
        this.qtdKw = qtdKw;
    }
    public Double getValorConta() {
        return valorConta;
    }
    public void setValorConta(Double valorConta) {
        this.valorConta = valorConta;
    }
    public Date getDataPagamento() {
        return dataPagamento;
    }
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    public Double getMediaConsumo() {
        return mediaConsumo;
    }
    public void setMediaConsumo(Double mediaConsumo) {
        this.mediaConsumo = mediaConsumo;
    }
    public ContaDeLuz(int id, Date dataLeitura, String numLeitura, Double qtdKw, Double valorConta, Date dataPagamento) {
        this.id = id;
        this.dataLeitura = dataLeitura;
        this.numLeitura = numLeitura;
        this.qtdKw = qtdKw;
        this.valorConta = valorConta;
        this.dataPagamento = dataPagamento;
        this.difData = getDifDataEmDias(dataLeitura, dataPagamento);
        this.mediaConsumo = qtdKw / difData;
    }

    @Override
    public String toString() {
        SimpleDateFormat dt = new SimpleDateFormat("dd-MM-yyyy");

        return
                this.id + " - " +
                        dt.format(this.dataLeitura) + " - " +
                        this.numLeitura + " - " +
                        this.qtdKw + " - " +
                        String.format("R$ %.2f",this.valorConta) + " - " +
                        dt.format(this.dataPagamento) +  " - " +
                        this.difData + " - " +
                        String.format("R$ %.2f", this.mediaConsumo);
    }

    private long getDifDataEmDias(Date data1, Date data2) {
        long difEmMiliseg = Math.abs(data2.getTime() - data1.getTime());
        return TimeUnit.DAYS.convert(difEmMiliseg, TimeUnit.MILLISECONDS);
    }
}
