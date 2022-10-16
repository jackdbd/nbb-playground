# Nbb playground

Playground to try out [nbb](https://github.com/babashka/nbb).

## Installation

This project can be managed with [Babashka tasks](https://book.babashka.org/#tasks) defined in a `bb.edn` file. You can check the list of available tasks using this command:

```sh
bb tasks
```

Install all npm packages from npm.js and all jars from Clojars:

```sh
bb install
```

## Development

Run a `.cljs` script using nbb:

```sh
bb demo
```

Remove all dependencies and the nbb cache:

```sh
bb clean
```

## Deploy (TODO)

Deploy to Google Cloud Functions 2nd generation.

```sh
bb deploy
```
