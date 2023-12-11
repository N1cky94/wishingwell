# AD 003 - Front-end framework

| Date       | Status   | Deciders       |
|------------|----------|----------------|
| 10/12/2023 | Accepted | - Nick Bauters |

## Context and Problem Statement

A front-end framework needs to be chosen for the project.
This framework will be used to create the front-end of the application.

This framework should be able to accommodate the decisions in AD001 and AD002.

## Decision Drivers

The decision on a Front-end framework, is driven by a couple constraints.
These constraints are described in AD001 and AD002.
- Monolithic project approach
- Modulair layering of the project
- Java only project

## Concrete Decision

### Option 1: Spring MVC with Thymeleaf

Thymeleaf is an easy to use framework that comes out of the box with Spring MVC.
Beginners can get started quickly, as most of the time Thymeleaf was used during educational programs.

A lot of the components need to be created from scratch or loaded in from external sources.
There is still a lot of HTML, CSS and JS involved in the development cycle.

**side by side**

| Pro's                 | Con's                                                            |
|-----------------------|------------------------------------------------------------------|
| - Easy to get started | - A lot of HTML, CSS and JS involved                             |
| - Easy to learn       | - A lot of components need to be created from scratch            |
| - Easy to maintain    | - A lot of components need to be loaded in from external sources |
| - Mainly Java based   |                                                                  |

### Option 2: Vaadin Framework

Vaadin is a pure Java framework that transposes web components to corresponding HTML and JS components via a node server and transpiler.
This enables the development team to work in a single code base, and not having to switch between different languages.

Vaadin also has a lot of components that can be used out of the box.

It does require some extra learning for beginners, as Vaadin is not a standard framework taught in training and academic worlds.

**side by side**

| Pro's                         | Con's                                   |
|-------------------------------|-----------------------------------------|
| - Full Java based             | - Requires extra learning for beginners |
| - Easy to get started         | - Steep learning curve                  |
| - No external forces required |                                         |

## Decision Outcome

We have decided to keep everything pure Java.
Therefor we will be using Vaadin as our front-end framework.

Option 2 has been chosen

### Implementation

[This will be documented later]

A view is a frontend component with a specific URL.
All other frontend components are named with Component at the end of the name.