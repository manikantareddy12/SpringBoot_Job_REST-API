# Spring Boot Job API

A demo Spring Boot application that provides a RESTful API to manage job postings. The application supports basic CRUD operations (Create, Read, Update, Delete) and uses an in-memory list to simulate a database.
## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)

## Features

- **CRUD Operations**: Create, Read, Update, and Delete job postings.
- **RESTful Endpoints**: Easily manage job posts via HTTP endpoints.
- **In-Memory Repository**: Uses an in-memory list to simulate a database.



## Installation

### Prerequisites

- **Java 21** or later must be installed.
- **Maven** must be installed.

### Steps

1. **Clone the repository**:
   ```bash
   git clone https://github.com/manikantareddy12/SpringJob_REST-API
   cd SpringJob_REST-API


2. **Build Project**:
    ```bash
   mvn clean install


## Running the Application

Start the Spring Boot application using Maven:

```bash
mvn spring-boot:run

```
## API Endpoints
- **GET /getJobs**

    Retrieves all job postings.

- **GET /getJob/{postId}**

  Retrieves a specific job post by its ID.
- **POST /addJob**

    Adds a new job post.

Example JSON Payload:
```bash
{
"jobId": 2,
"jobTitle": "Java Developer",
"jobDesc": "This is an java developer job posting",
"experience": 4,
"techSkills": ["Java", "Spring Boot"]
}
```

- **PUT /updateJob**

    Updates an existing job post.

- **DELETE /deleteJob/{postId}**

    Deletes a job post by its ID.