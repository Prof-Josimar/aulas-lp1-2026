$ErrorActionPreference = "Stop"

$projectName  = $env:project_name
$author       = $env:author
$repoUrl      = $env:repo_url
$logoUrl      = $env:logo_raw_url
$dataIso      = $env:data_iso
$horaIso      = $env:hora_iso
$userName     = $env:USERNAME
$computerName = $env:COMPUTERNAME
$currentDir   = (Get-Location).Path
$osName       = $env:OS_NAME
$osVer        = $env:OS_VER
$buildNum     = $env:BUILD_NUM
$ubrNum       = $env:UBR_NUM
$buildInfo    = $env:BUILD_INFO
$gitVer       = $env:GIT_VER
$javaVer      = $env:JAVA_VER
$filename     = $env:filename

$content = @"
# $projectName

![Java](https://img.shields.io/badge/Java-11-orange)
![NetBeans](https://img.shields.io/badge/NetBeans-12%2B-1B6AC6)
![Tomcat](https://img.shields.io/badge/Tomcat-9-F8DC75?logo=apachetomcat&logoColor=black)
![Windows](https://img.shields.io/badge/Windows-10%20LTSC-0078D6?logo=windows10)
![Status](https://img.shields.io/badge/status-em%20desenvolvimento-brightgreen)

<img src="$logoUrl" width="300" alt="logo">

## Sobre o projeto
Repositorio com os exercicios e projetos de **$projectName**.

## Informacoes do sistema

| Campo | Valor |
|---|---|
| Data | $dataIso |
| Hora | $horaIso |
| Usuario | $userName |
| Computador | $computerName |
| Diretorio atual | $currentDir |
| Sistema Operacional | $osName |
| Versao do Windows | $osVer |
| Build | $buildNum.$ubrNum |
| Detalhes do Build | $buildInfo |
| Git | $gitVer |

## Ambiente de desenvolvimento
- **IDE:** NetBeans 12+
- **Servidor:** Tomcat 9
- **Java:** $javaVer

> Atalho usado no projeto: **System.out.println("");**

## Autor
**$author**

[Repositorio no GitHub]($repoUrl)
"@



Set-Content -Path $filename -Value $content -Encoding UTF8
Add-Content -Path $filename -Value "" -Encoding UTF8
git status --porcelain | Out-File -FilePath $filename -Append -Encoding UTF8
Write-Host "README.md escrito em: $((Get-Location).Path)\$filename"



