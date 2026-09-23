@echo off
chcp 65001 >nul
title Gerador de README - Projeto Java LP1 2026

REM ============================================================
REM ===================== CONFIGURACOES =========================
REM ============================================================
set "project_name=Algoritmos e Estrutura de Dados (em Java)"
set "author=Josimar Ribeiro"
set "github_user=Prof-Josimar"
set "repo_name=aulas-lp1-2026"
set "filename=README.md"
set "repo_url=https://github.com/Prof-Josimar/aulas-lp1-2026"
set "logo_raw_url=https://github.com/Prof-Josimar/lp1_2026_1_bim/blob/main/img/logo.png"


for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format yyyy-MM-dd"') do set "data_iso=%%i"
for /f %%i in ('powershell -NoProfile -Command "Get-Date -Format HH:mm:ss"') do set "hora_iso=%%i"

REM ============================================================
REM =============== COLETA DE INFORMACOES DO SO =================
REM ============================================================
set "REG_PATH=HKLM\SOFTWARE\Microsoft\Windows NT\CurrentVersion"

for /f "tokens=3" %%a in ('reg query "%REG_PATH%" /v CurrentBuild 2^>nul') do set "BUILD_NUM=%%a"
for /f "tokens=3" %%a in ('reg query "%REG_PATH%" /v UBR 2^>nul') do set "UBR_NUM=%%a"
for /f "tokens=3" %%a in ('reg query "%REG_PATH%" /v CurrentVersion 2^>nul') do set "OS_VER=%%a"
for /f "tokens=3,*" %%a in ('reg query "%REG_PATH%" /v BuildLabEx 2^>nul') do set "BUILD_INFO=%%b"
for /f "tokens=3,*" %%a in ('reg query "%REG_PATH%" /v ProductName 2^>nul') do set "OS_NAME=%%b"

if not defined UBR_NUM set "UBR_NUM=0"
if not defined BUILD_NUM set "BUILD_NUM=desconhecido"
if not defined OS_VER set "OS_VER=desconhecido"
if not defined BUILD_INFO set "BUILD_INFO=desconhecido"
if not defined OS_NAME set "OS_NAME=desconhecido"

REM Versao do Java (java -version escreve no stderr, por isso o 2^>^&1)
for /f "tokens=* delims=" %%v in ('java -version 2^>^&1') do (
    if not defined JAVA_VER set "JAVA_VER=%%v"
)
if not defined JAVA_VER set "JAVA_VER=nao encontrado"

for /f "tokens=* delims=" %%v in ('git --version 2^>nul') do set "GIT_VER=%%v"
if not defined GIT_VER set "GIT_VER=nao encontrado"

REM ============================================================
REM =========== GERA O README.MD VIA POWERSHELL ==================
REM ============================================================
echo Gerando %filename%...
powershell -NoProfile -ExecutionPolicy Bypass -File "%~dp0gerar_readme.ps1"

if not exist "%filename%" (
    echo [ERRO] Falha ao gerar %filename%. Verifique se gerar_readme.ps1 esta na mesma pasta.
    goto :fim
)

REM ============================================================
REM ========================= GIT =================================
REM ============================================================
if not exist ".git" (
    echo Criando repositorio Git local...
    git init
)

git branch -M main
git add -A

set "HAS_CHANGES=0"
git diff --cached --quiet
if errorlevel 1 set "HAS_CHANGES=1"

if "%HAS_CHANGES%"=="0" (
    echo Nenhuma alteracao para commitar.
    goto :abre_repo
)

set "commit_msg=Atualizacao automatica"

git commit -m "Atualizado em %data_iso% %hora_iso% (%commit_msg%)"
if errorlevel 1 (
    echo [ERRO] Falha ao commitar.
    goto :fim
)

git push origin main
if errorlevel 1 (
    echo [ERRO] Falha ao dar push. Verifique conexao/chave SSH.
) else (
    echo Push realizado com sucesso!
)

:abre_repo
::start "" "%repo_url%"

:fim



::start "" https://github.com/Prof-Josimar/acenelio-curso-logica-de-programacao/tree/main
start "" https:/github.com:Prof-Josimar/aulas-lp1-2026
::git remote add origin git@github.com:Prof-Josimar/aulas-lp1-2026.git



