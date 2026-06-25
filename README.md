> [!NOTE]
> This is an attempt of making [techcup](https://github.com/0strezz/TCBend) again but myself.
>
> No teammates this time. For the seek of learning.

## Table of contents

- [dependencies](#dependencies-meaven-related---no-trivial-ones)
- [about password](#about-password)

## Dependencies (Meaven related - no trivial ones)

### spring-boot-starter-data-jpa

**Why it is needed:**

Adds support for JPA-based persistence using Hibernate as the default ORM.

**How it is used:**

- Defining entities with `@Entity`
- Creating repositories using `JpaRepository`
- Managing relationships (`@OneToMany`, `@ManyToOne`, etc.)
- Handling database operations without writing SQL manually

### postgresql (runtime)

**Why it is needed:**

Acts as the JDBC driver to connect your application to a PostgreSQL database.

**How it is used:**

- Enables Hibernate/Spring Data JPA to communicate with PostgreSQL
- Used at runtime to establish database connections
- Configured via `application.properties` or `application.yml`

### spring-boot-starter-test (test scope)

**Why it is needed:**

Provides a comprehensive testing toolkit for Spring Boot applications.

**How it is used:**

- Includes JUnit, Mockito, and Spring testing utilities
- Writing unit and integration tests (`@SpringBootTest`, `@DataJpaTest`)
- Mocking dependencies and verifying behavior

### lombok (provided scope)

**Why it is needed:**

Reduces boilerplate code in Java classes.

**How it is used:**

- Auto-generating getters/setters (`@Getter`, `@Setter`)
- Constructors (`@NoArgsConstructor`, `@AllArgsConstructor`)
- Builder pattern (`@Builder`)
- Cleaner entity and DTO definitions

## About password

The database password is not given for obvious reasons, so the solution is storing the password
in a file which is not being tracked by git.

Instead of running the project normally, you will have to run `run.sh` script, it will write
the necessary stuff for the project to run (including the password), therefore you will have
to got the password in your local computer.

_see run.sh script_
