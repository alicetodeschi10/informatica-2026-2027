1\. Sto lavorando in locale direttamente sulla postazione fisica del mio computer.

2\. Questo ambiente di sviluppo non richiede l'uso di macchine virtuali o container cloud.

3\. Il file viene salvato sul disco locale prima di essere registrato con Git.



|Tempo di avvio|Quasi immediato: apri VS Code e lavori|Più lento: serve creare o riavviare la macchina virtuale remota (di solito da decine di secondi a qualche minuto|
|-|-|-|
|Dipendenza dalla connessione|Si può lavorare offline; la rete serve solo per pull e push|Serve una connessione stabile per tutto il tempo di lavoro|
|Consumo di quota|Nessuno: usa le risorse del computer|Consuma ore-core della quota mensile gratuita finché è attivo|
|Uniformità fra postazioni diverse|Bassa: software, versioni e configurazioni possono cambiare da un PC all'altro   |Alta: ogni volta si parte dallo stesso ambiente preconfigurato|



Sceglierei il Codespace quando lavoro su una postazione che non conosco o in un gruppo, perché l'ambiente è identico per tutti e non devo installare nulla.

Sceglierei la postazione quando ho poca quota o una connessione instabile, perché non consuma ore-core e funziona anche offline.

Per un lavoro lungo e abituale preferirei la postazione, tenendo il Codespace per le emergenze o per le prove su computer di qualcun altro.

