using namespace std;

#include <iostream>
#include <fstream>
#include <sstream>
#include <string>
#include <set>

#include "departamento.hpp"

void printDepartamento(Departamento d) {
    cout << "\t* " << d.getName() << " - " << d.getId() << endl;
}

string removeAspas(string s) {
    s.erase(s.begin());
    s.erase(s.end()-1);
    return s;
}

int main() {
    set<Departamento> departamentos;

    ifstream in("dep.csv");
    string line, name, id;
    while (getline(in, line)) {
       istringstream lineStream(line);
       getline(lineStream, name, ';');
       name = removeAspas(name);

       getline(lineStream, id, ';');
       id = removeAspas(id);

       departamentos.insert(Departamento(name, stoi(id)));
    }

    cout << "Departamentos lidos pelo arquivo:" << endl;
    for (Departamento d : departamentos) {
        printDepartamento(d);
    }

    in.close();

    return 0;
}
