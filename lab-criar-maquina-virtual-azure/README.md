
# Tutorial: Criação e Configuração de uma Máquina Virtual no Microsoft Azure

## Introdução

Neste tutorial, você aprenderá a criar e configurar uma máquina virtual (VM) na plataforma Microsoft Azure. Vamos abordar cada etapa do processo, desde a criação da conta no Azure até a configuração final da VM.

## Pré-requisitos

Antes de começar, certifique-se de ter os seguintes itens:
- Uma conta no Microsoft Azure. Se você não tiver uma, pode criar uma [aqui](https://azure.microsoft.com/pt-br/free/).
- Acesso ao portal do Azure.

## Passo 1: Acessar o Portal do Azure

1. Acesse o [Portal do Azure](https://portal.azure.com/).
2. Faça login com sua conta Microsoft.

## Passo 2: Criar um Novo Recurso

1. No menu à esquerda, clique em **"Criar um recurso"**.
2. Na barra de pesquisa, digite **"Máquina Virtual"** e selecione a opção **"Máquina Virtual"**.

## Passo 3: Configurar a Máquina Virtual

### 3.1 Informações Básicas

1. Selecione a **assinatura** que deseja usar.
2. Crie um **grupo de recursos** ou selecione um existente.
3. Insira um **nome** para a máquina virtual.
4. Escolha a **região** onde a VM será criada.
5. Selecione a **imagem** do sistema operacional (ex: Windows Server, Ubuntu, etc.).
6. Escolha o **tamanho** da VM de acordo com suas necessidades.

### 3.2 Configurações de Administração

1. Insira um **nome de usuário** para a VM.
2. Escolha o método de autenticação (senha ou chave SSH).
3. Insira e confirme a **senha** ou **chave SSH**.

### 3.3 Configurações de Rede

1. Crie uma nova **rede virtual** ou selecione uma existente.
2. Crie um novo **sub-rede** ou selecione uma existente.
3. Configure um **endereço IP público** se necessário.
4. Configure as **regras de segurança** (NSG) para permitir o tráfego necessário (ex: RDP, SSH).

### 3.4 Configurações de Armazenamento

1. Escolha o tipo de **disco do sistema operacional** (SSD, HDD).
2. Adicione discos de dados adicionais se necessário.

### 3.5 Configurações Avançadas

1. Configure **extensões** se necessário (ex: extensões de monitoramento, antivírus, etc.).
2. Configure **tags** para organizar e gerenciar recursos.

## Passo 4: Revisar e Criar

1. Revise todas as configurações.
2. Clique em **"Criar"** para iniciar a implantação da máquina virtual.

## Passo 5: Acessar a Máquina Virtual

### 5.1 Acesso via RDP (Windows)

1. No portal do Azure, navegue até a VM criada.
2. Clique em **"Conectar"** e selecione **"RDP"**.
3. Baixe o arquivo RDP e abra-o.
4. Insira as credenciais configuradas anteriormente.

### 5.2 Acesso via SSH (Linux)

1. No portal do Azure, navegue até a VM criada.
2. Clique em **"Conectar"** e selecione **"SSH"**.
3. Use o comando SSH fornecido para acessar a VM via terminal.

## Conclusão

Parabéns! Você criou e configurou com sucesso uma máquina virtual no Microsoft Azure. Agora você pode começar a usar sua VM para hospedar aplicativos, desenvolver software ou qualquer outra necessidade computacional.

Se tiver dúvidas ou precisar de mais informações, consulte a [documentação oficial do Azure](https://docs.microsoft.com/pt-br/azure/virtual-machines/).

---

**Autor:** Instrutor Especializado em Microsoft Azure
