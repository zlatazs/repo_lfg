# 🎮 LFG Social Platform

## 📌 Krótki opis

REST API dla platformy typu Looking For Group (LFG), umożliwiającej graczom:

tworzenie i zarządzanie profilami,

wyszukiwanie innych graczy,

tworzenie lobby/grup,

publikowanie postów rekrutacyjnych,

dopasowywanie graczy na podstawie poziomu umiejętności (match-making).

### 🎯 Problemy, które rozwiązuje

- Brak platformy do szybkiego znajdowania graczy do wspólnej gry  
- Utrudnione tworzenie i dołączanie do grup (lobby)  
- Brak efektywnego systemu dopasowywania graczy według poziomu umiejętności  

---

## ⚙️ Stack technologiczny

### Backend
- Spring Boot  
- Spring Web (REST API)  
- Spring Data JPA (Hibernate)  
- MySQL  
- Spring Security  
- JWT (JSON Web Token)  
- Lombok  

### Narzędzia
- Maven  
- Postman  
- JUnit  

---

## 📁 Struktura projektu

src/
 ├── main/
 │   ├── java/com/example/lfg/
 │   │   ├── controller/       # Endpointy REST
 │   │   ├── service/          # Logika biznesowa
 │   │   ├── repository/       # Repozytoria JPA
 │   │   ├── model/            # Encje (Player, Game, Lobby, Post, Skill)
 │   │   ├── dto/              # Obiekty transferowe
 │   │   ├── mapper/           # Mapowanie DTO <-> Entity
 │   │   └── config/           # Konfiguracja aplikacji
 │   │
 │   └── resources/
 │       ├── application.yml   # Konfiguracja środowiska
 │       └── schema.sql        # (opcjonalnie) inicjalizacja bazy
 │
 └── test/                     # Testy jednostkowe i integracyjne


---

## 🚀 Instalacja i uruchomienie

### 1. Wymagania

- Java 17+  
- Maven  
- MySQL  

---
 ### 2. Klonowanie repozytorium
git clone https://github.com/zlatazs/lfg-platform-api.git
cd lfg-platform-api
 
### 2. Konfiguracja bazy danych

spring.datasource.url=jdbc:mysql://localhost:3306/lfg_db
spring.datasource.username=zlatazs
spring.datasource.password=zlzlzllz
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

---

### 3. Build projektu
mvn clean install
---

### 4. Uruchomienie
mvn spring-boot:run

---


## 📡 Główne endpointy

Players
GET    /api/players
POST   /api/players
GET    /api/players/{id}
PUT    /api/players/{id}
DELETE /api/players/{id}

Games
GET    /api/games
POST   /api/games

Lobby / Groups
GET    /api/lobbies
POST   /api/lobbies
JOIN   /api/lobbies/{id}/join

Recruitment Posts
GET    /api/posts
POST   /api/posts

Matchmaking
GET /api/matchmaking?gameId={id}&skillLevel={level}


## 📡 Przykładowe użycie API

### Tworzenie gracza

POST /players

{
"nickname": "ProGamer123",
"skillLevel": "ADVANCED",
"mmr": 2400
}
### Odpowiedź
{
"id": 1,
"nickname": "ProGamer123",
"skillLevel": "ADVANCED",
"mmr": 2400
}



---

## 🗂 Główne encje

- Player – profil gracza (MMR, skill level)  
- Game – dostępne gry  
- Lobby – grupy graczy  
- Post – posty rekrutacyjne (LFG)  

---

## 🔐 Bezpieczeństwo

API wykorzystuje:

- Spring Security  
- JWT (JSON Web Token)  



---

## 📄 Licencja

Projekt edukacyjny.
