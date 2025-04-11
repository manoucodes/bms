[![Build](https://github.com/manoucodes/bms/actions/workflows/release.yml/badge.svg?branch=master)](https://github.com/manoucodes/bms/actions/workflows/release.yml)

[![SonarCloud Quality Gate](https://sonarcloud.io/api/project_badges/measure?project=manoucodes_bms&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=manoucodes_bms) [![Coverage](https://sonarcloud.io/api/project_badges/measure?project=manoucodes_bms&metric=coverage)](https://sonarcloud.io/summary/new_code?id=manoucodes_bms) [![Maintainability](https://sonarcloud.io/api/project_badges/measure?project=manoucodes_bms&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=manoucodes_bms)

[![codecov](https://codecov.io/gh/manoucodes/bms/graph/badge.svg?token=0G499NPO3R)](https://codecov.io/gh/manoucodes/bms)

[![DeepSource](https://app.deepsource.com/gh/manoucodes/bms.svg/?label=active+issues&show_trend=true&token=ScEtUsphfOCpS8qzYBFhgKaY)](https://app.deepsource.com/gh/manoucodes/bms/) [![DeepSource](https://app.deepsource.com/gh/manoucodes/bms.svg/?label=resolved+issues&show_trend=true&token=ScEtUsphfOCpS8qzYBFhgKaY)](https://app.deepsource.com/gh/manoucodes/bms/)
# Booking Management Service (BMS)
A modular Kotlin + Spring Boot application designed to handle the core logic for booking services (e.g., salons, barbershops, etc.). Built following Clean Architecture principles for scalability, testability, and maintainability.

## Architecture Overview
The BMS app is divided into 4 core modules:

| Module               | Description                                                           |
|----------------------|------------------------------------------------------------------------|
| `bms-api`            | Exposes REST endpoints and OpenAPI docs via Springdoc                 |
| `bms-application`    | Contains use cases and application services                           |
| `bms-domain`         | Defines domain models, business rules, and interfaces                 |
| `bms-infrastructure` | Implements domain interfaces (e.g., database, external APIs)          |

Follows a hexagonal architecture to ensure separation of concerns and easy testability.

## Getting Started

### Prerequisites
- Java 17+
- Docker & Docker Compose
- Maven (or use `./mvnw`)

### Build and run
```bash
./mvnw clean install
./mvnw -pl api-client spring-boot:run -Dspring-boot.run.profiles=dev
```

### Run app with docker
```bash
# Start
docker-compose -f docker-compose.yml up --build

# Stop
docker-compose -f docker-compose.yml down
```

### Run app & observability with docker
```bash
# Start
docker-compose -f docker-compose.yml -f docker-compose.observability.yml up --build

# Stop
docker-compose -f docker-compose.yml -f docker-compose.observability.yml down
```

