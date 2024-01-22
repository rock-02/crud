# Department Controller

The `departmentController` is a RESTful API controller responsible for handling HTTP requests related to the Department entity in the CRUD (Create, Read, Update, Delete) operations.

## Endpoints

### 1. Create Department

- **Endpoint:** `POST /department`
- **Description:** Creates a new department.
- **Request Body:** Expects a JSON object representing the department.
- ![Create Department](![create](https://github.com/rock-02/crud/assets/98045645/d533c9d0-f474-43e6-ab1d-64f9d1c0a2f7)

)

### 2. Get All Departments

- **Endpoint:** `GET /department`
- **Description:** Retrieves a list of all departments.
- ![Get Departments](![get](https://github.com/rock-02/crud/assets/98045645/68ab9eb0-d73e-4982-9167-bc4cff50e196)

)


### 3. Get Department by ID

- **Endpoint:** `GET /department/{id}`
- **Description:** Retrieves a specific department by its ID.
- **Path Variable:**
  - `id`: The unique identifier for the department.
-![get Department](![getOne](https://github.com/rock-02/crud/assets/98045645/80e54d2d-2601-4758-abeb-6b934ccb93ca)

)

### 4. Delete Department by ID

- **Endpoint:** `DELETE /department/{id}`
- **Description:** Deletes a specific department by its ID.
- **Path Variable:**
- `id`: The unique identifier for the department.
- ![delete Department](!![Deleted](https://github.com/rock-02/crud/assets/98045645/fd451b7f-cb1b-44f8-9544-72aafd157018)


### 5. Update Department by ID

- **Endpoint:** `PUT /department/{id}`
- **Description:** Updates a specific department by its ID.
- **Path Variable:**
  - `id`: The unique identifier for the department.
- **Request Body:** Expects a JSON object representing the updated department.'
- [Update Department](![update](https://github.com/rock-02/crud/assets/98045645/8a0d08f3-22c0-4121-b29a-0b69578da15f)


## Usage

To interact with the Department API, you can use tools like `curl`, Postman, or any other HTTP client.

## Dependencies

- Spring Boot
- Spring Web
- h2SQL Database
