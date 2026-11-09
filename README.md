# Notes app: Spring Security, lesson 2 starter

The notes app with Exercises 1–4 done. Use it if you didn't finish lesson 1. Spring Boot serves both the API and the frontend (`src/main/resources/static`). The H2 database is in memory and resets on restart.

## Run

```bash
./mvnw spring-boot:run
```

Open http://localhost:8080.

## Users

| Username | Password | Role |
|---|---|---|
| `user1` | `pw` | USER |
| `user2` | `pw` | USER |
| `admin` | `pw` | ADMIN |

## Exercises

`TODO Exercise N` comments mark the code you change. CSRF protection is back on, as Exercise 4 leaves it, so the page can't add notes until Exercise 5.
