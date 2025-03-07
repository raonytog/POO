#include "departamento.hpp"

#include <iostream>

Departamento::Departamento(const string& name, const int& id) {
    this->name = name;
    this->id = id;
    cout << "Departamento " << this->name << " - " << this->id << " criado!" << endl;
}

string Departamento::getName() const {
    return this->name;
}

int Departamento::getId() const {
    return this->id;
}

bool Departamento::operator<(const Departamento& other) const {
    return this->getId() < other.getId();
}
