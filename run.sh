# !/bin/sh

cat <<EOF > src/main/resources/application.yml
spring:
  datasource:
    url: jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:5432/postgres
    username: postgres.fmmosgjxpfknqatupsxk
    password: $(tr -d '\n' < ./password)
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
EOF

mvn package

cat <<EOF > src/main/resources/application.yml
spring:
  datasource:
    url: jdbc:postgresql://aws-1-sa-east-1.pooler.supabase.com:5432/postgres
    username: postgres.fmmosgjxpfknqatupsxk
    password:
    driver-class-name: org.postgresql.Driver

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
    properties:
      hibernate:
        format_sql: true
EOF
