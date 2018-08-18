# NewtonX-Code
Back-end code changllege


The purpose of this challenge is to build a RESTful API that implements some CRUD (create, read, update, destroy) operations on a "user" resource through HTTP requests, and returns JSON data where applicable.
Specification:

The user resource contains the following information:
- A unique number identifier
- First name
- Last name

For example, a JSON representation of a single user could be:
{
  "id": 9,
  "firstName": "Maggie",
  "lastName": "Wu"
}

Your API should perform the following operations:
- Fetch a list of all users
- Fetch a specific user by the user's identifier
- Create a new user by sending a JSON payload with only the first name and last name, and return the created user after assigning a unique identifier.

You may build the user data in memory, but try to use a modular approach so that it could be simple to switch to a database.

Technology:
- Please use Java 8 or below
- Since the focus is on developing a bare-bones API, please use RESTEasy for the REST framework, rather than Spring

Bonus:
- Connect your API to a database and deploy it!
- Error handling: what happens when someone makes a request for a user that doesn't exist?

Evaluation Criteria:
- Problem solving capability
- Code elegance
- Code maintainability and modularity
- Attention to detail (code style, proper indentation)
- Code testability
