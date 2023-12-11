# AD 002 - Layering of the project

| Date       | Status   | Deciders       |
|------------|----------|----------------|
| 10/12/2023 | Accepted | - Nick Bauters |

## Context and Problem Statement

As the project will be developed in a monolithic approach, the project needs to be layered in a way that it is easy to maintain and extend.
How the layering should be done is investigated in this AD.

## Decision Drivers

The layering should adhere to the following constraints:
- Easy to maintain
- Easy to read
- Easy to extend
- Easy to change implementations when prices or circumstances change

## Concrete Decision

### Option 1: functional layering

The project can be layered by function.

This will keep all views together, all controllers together, all services together, etc.

### Option 2: \<short description\>

<fill in, complete description of this option>

### Option 3: Hybrid approach

In this hybrid approach we propose the following:

The front-end will be seperated from the back-end within the project.
Further on will every seperate module be seperated from each other, based on functionality.

This will result in the following structure:

```agsl
project_root
├── src_root
│   ├── wishingwell_backend
|   |── security
|   |── front-end
|   |── other_modules
|   |── ...

```
## Decision Outcome

A modulair approach has been chosen.
This will benefit the project in the long run, as it will be easier to maintain and extend.
We will keep everything front-end together.

This means we decided upon option 3.

This will also keep the posibility open for future development of the project. And even make it possible to split back and front-end modules into a microservice architecture.

### Implementation

[This will be documented later]