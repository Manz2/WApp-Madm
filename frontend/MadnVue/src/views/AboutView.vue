<template>
<div>
    <h1 class="header">Mensch Ärgere dich nicht</h1>
    <div class="container">
        <router-link class="btn btn-primary" to="/playerSelect" role="button">Starte ein Spiel</router-link>
        <h3 class="header-common">Details</h3>
        <div class="accordion" id="accordionExample">
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-1" aria-expanded="true" aria-controls="collapseOne">
                    Felder
                </button>
              </h2>
              <div id="collapse-1" class="accordion-collapse collapse show" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <li><b>Player</b>: Wartefeld der Figuren</li>
                    <li><b>Home</b>: Finales Feld der Figuren</li>
                    <li><b>Field</b>: Eigentliches Spielfeld</li> 
                </div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-2" aria-expanded="false" aria-controls="collapseTwo">
                    Spielablauf
                </button>
              </h2>
              <div id="collapse-2" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <ul>
                        <li>Jeder Spieler erhält 4 Figuren</li>
                        <li>Ziel ist es alle seine Figuren in die Home Felder zu bewegen</li>
                        <li>Ist ein Spieler an der Reihe darf er würfeln und die gewürfelte Anzahl fahren</li>
                        <li>Bewegt sich ein Spieler A auf ein Feld auf welchem eine Figur von Spieler B steht muss Spieler B seine Figur wieder in das Begin Feld stellen</li>
                        <li>Gewonnen hat der Spieler der als erstes alles seine 4 Figuren im Home Feld hat</li>
                    </ul>
                </div>
              </div>
            </div>
            <div class="accordion-item">
              <h2 class="accordion-header">
                <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-3" aria-expanded="false" aria-controls="collapseThree">
                    Geschichte des Spiels
                </button>
              </h2>
              <div id="collapse-3" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                <div class="accordion-body">
                    <ul>
                        <li>Das Spiel wurde Anfang des 20. Jahrhunderts von Josef Friedrich Schmidt erfunden. Schmidt war ein deutscher Spielehersteller und brachte das Spiel erstmals im Jahr 1914 unter dem Namen "Mensch ärgere Dich nicht!" auf den Markt.</li>
                        <li>Die Entstehung des Spiels fällt in eine Zeit, als Gesellschaftsspiele in Deutschland populär wurden. Die Menschen suchten nach unterhaltsamen Aktivitäten, um sich in der Freizeit zu beschäftigen</li>
                        <li>Das Spiel "Mensch ärgere dich nicht" erfreute sich schnell großer Beliebtheit in Deutschland und wurde in den folgenden Jahrzehnten zu einem der bekanntesten und meistgespielten Brettspiele im Land</li>
                        <li>Das Spiel hat sich zu einem wichtigen kulturellen Erbe Deutschlands entwickelt und ist ein Teil der deutschen Spielt radition</li>
                    </ul>
                </div>
              </div>
            </div>
            <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-4" aria-expanded="false" aria-controls="collapseThree">
                    Namensgebung
                  </button>
                </h2>
                <div id="collapse-4" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <p>Der Name "Mensch ärgere dich nicht" spiegelt den spielerischen Charakter des Spiels wider. Es kann zu frustrierenden Momenten führen, wenn die eigenen Spielfiguren von Gegnern zurückgesetzt werden, was zu Ärger oder Gelächter unter den Spielern führt</p>
                  </div>
                </div>
              </div>
              <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-5" aria-expanded="false" aria-controls="collapseThree">
                    Web-Interface
                  </button>
                </h2>
                <div id="collapse-5" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <p>Ergänzend zu unserer TUI & GUI die in der Vorlesung Softwareengineering entstanden sind entwickeln wir hier ein Web Interface für die Vorlesung WebTechnologien Dieses Interface ist mit dem Scala Play Framework entstanden</p>
                  </div>
                </div>
              </div>
              <div class="accordion-item">
                <h2 class="accordion-header">
                  <button class="accordion-button collapsed" type="button" data-bs-toggle="collapse" data-bs-target="#collapse-6" aria-expanded="false" aria-controls="collapseThree">
                    Autoren
                  </button>
                </h2>
                <div id="collapse-6" class="accordion-collapse collapse" data-bs-parent="#accordionExample">
                  <div class="accordion-body">
                    <ul class="author-list">
                        <li>Erik Manz</li>
                        <li>Sebastian Kaeser</li>
                    </ul>
                  </div>
                </div>
              </div>
          </div>
    </div>
  </div>
</template>

<style scoped>
.container {
    margin-top: 10%;
}

.container > * {
    margin-bottom: 4%;
}

.header {
    font-size: 3em;
    text-align: center;
    margin : auto auto;
    margin-top: 10%;
}
</style>
