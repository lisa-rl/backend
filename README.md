# backend
Backend of the first Cloud Integration project

Lignes de commandes:
- ./gradlew ou gradlew (dépend de l'IDE)              --> build
- git stash                                           --> mettre de côté le code réalisé
- git checkout <branche>                              --> aller sur une branche en particulier
- git push --set-upstream origin feature/<issue>
- git branch                                          --> savoir dans quelle branche on se trouve
- git stash apply                                     --> appliquer les modifs mises de côté
- git add .
- git commit -m "#numero issue <issue>"

Pour rendre un fichier exécutable (notamment gradlew): git update-index --chmod=+x gradlew

Docker:
-	./gradlew bootJar                                   --> crée un dossier libs et création d'un fichier .jar
- java -jar build\libs\server.jar                     --> execute programme
-	docker build --tag=server:latest .                  --> génère une image
-	docker run -d -p 8080:8080 server                   --> génère un conteneur (on obtient le PID du conteneur)
