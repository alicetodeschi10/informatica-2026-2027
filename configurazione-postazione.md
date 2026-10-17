1. Identità di Git
Apri VS Code e il terminale (menu Terminal → New Terminal).
Scrivi questi comandi, sostituendo con i tuoi dati:
bash
git config --global user.name "Nome Cognome"
git config --global user.email "email-di-github"
git config --global --list

Cosa devi vedere: nell’elenco ci sono user.name e user.email con i tuoi dati.
L’email deve essere la stessa dell’account GitHub (la trovi in Settings → Emails).

2. Estensioni

Apri le Estensioni con Ctrl+Shift+X.
Cerca e installa Extension Pack for Java e GitHub Codespaces.

Cosa devi vedere: le due estensioni nell’elenco Installed. Aprendo un file .java, in basso compare Java: Ready.

3. Verifica del JDK
 nel terminale scrivi

bash
java -version
javac -version

Cosa devi vedere: un numero di versione per tutti e due i comandi.

Se non lo vedi
Installa un JDK , poi chiudi e riapri VS Code.
Se funziona java ma non javac, hai solo il JRE: serve il JDK.

4. Recupero del repository

Su GitHub apri il repository e clicca Code per copiare l’URL.
In VS Code premi Ctrl+Shift+P e scegli Git: Clone.
Incolla l’URL, scegli una cartella e clicca Open.

Cosa devi vedere: i file del repository nell’Explorer. Scrivendo git status risponde working tree clean.

5. Creazione del progetto

Premi Ctrl+Shift+P, scegli Java: Create Java Project e poi No build tools.
Scegli la cartella del repository e dai un nome al progetto.
Apri src/App.java
Cosa devi vedere: il file src/App.java senza errori rossi, con i link Run | Debug sopra main.
Controlla che il nome del file sia uguale al nome della classe!!

6. Esecuzione da VS Code

clicca su Run sopra main.

Cosa devi vedere: nel terminale in basso compare

Hello, World!

7. Esecuzione da terminale

nella cartella del progetto scrivi

bash
javac -d bin src/App.java
java -cp bin App

Cosa devi vedere: la stessa scritta Hello, World!. Il primo comando non stampa nulla: è normale.

8. Commit

Cosa fare

bash
git add .
git commit -m "Aggiunge la procedura di configurazione della postazione"
git push

Cosa devi vedere: il file nel repository su GitHub, con il tuo messaggio di commit.

Controllo finale
 git config --global --list mostra nome ed email
 Le estensioni Java sono installate (Java: Ready)
 java -version e javac -version rispondono
 Il repository è sul PC
 Il programma stampa il messaggio sia con Run sia da terminale
 Il commit si vede su GitHub