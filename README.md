# Edools-RPS-XML
Generates XML output from [Edools](http://www.edools.com/) for generation of the Nota Carioca NFS-e (Nota Fiscal de Serviços Eletrônica).

It polls the Edools API at specified intervals to retrieve payment, product and customer information and generate an RPS bulk file (XML) to be sent to [Nota Carioca](https://notacarioca.rio.gov.br/).

---

Gera saída XML do [Edools](http://www.edools.com/) para geração da NFS-e da Nota Carioca (Nota Fiscal de Serviços Eletrônica).

Verifica via API do Edools em intervalos de tempo especificados para recuperar informações de pagamentos, produtos e clientes e gera um arquivo de lote RPS (XML) para ser enviado para a [Nota Carioca](https://notacarioca.rio.gov.br/).

---

Exemplo/Example - config.properties:

#Arquivo de configuração para o gerador de NFS-e
edoolsToken = 0123456789abcdefghijklmnopqrstuv:0123456789abcdefghijklmnopqrstuv
schoolGuid = 000
edoolsStatus = authorized,done
checkInterval = 3600
serie = UNICA
tipo = 1
naturezaOperacao = 3
optanteSimplesNacional = 1
incentivadorCultural = 0
status = 1
cnpj = 12345678901234
inscricaoMunicipal = 12345678
deducoes = 0
pis = 0
cofins = 0
inss = 0
ir = 0
csll = 0
issRetido = 2
iss = 0
outrasRetencoes = 0
aliquota = 0
descontoIncondicionado = 0
descontoCondicionado = 0
codigoTributacaoMunicipio = 123456789
servicoCodigoMunicipio = 1234567