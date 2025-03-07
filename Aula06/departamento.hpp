#include <string>

using namespace std;

class Departamento {
    private:
        string name;
        int id;

    public:
        Departamento(const string& name, const int& id);
        string getName() const;
        int getId() const;
        bool operator<(const Departamento& other) const;
};