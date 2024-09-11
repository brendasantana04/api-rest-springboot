## Diagrama de Classes

````mermaid
classDiagram
    class Planeta {
        +Long id
        +String nome
        +String tipo
        +Double tamanho
        +Galaxia galaxia
    }

    class Estrela {
        +Long id
        +String nome
        +String tipo
        +Double tamanho
        +Double temperaturaSuperficial
        +Galaxia galaxia
    }

    class Galaxia {
        +Long id
        +String nome
        +String tipo
        +Double tamanho
        +Double distanciaDaTerra
    }

    class Constelacao {
        +Long id
        +String nome
    }

    Planeta "1" -- "0..1" Galaxia : pertence a
    Estrela "1" -- "0..1" Galaxia : pertence a
    Constelacao "1" -- "0..*" Estrela : contém

    %% Relationships
    Planeta "0..*" -- "0..1" Estrela : relaciona
    Estrela "0..*" -- "0..1" Galaxia : pertence a
    Galaxia "1" -- "0..*" Planeta : contém
    Galaxia "1" -- "0..*" Estrela : contém
