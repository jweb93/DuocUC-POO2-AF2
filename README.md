![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Formativa 2 – Desarrollo Orientado a Objetos II

## 💻 Proyecto: SpeedFast
## 👤 Autor del proyecto
- **Nombre completo:** Javier Rojas
- **Sección:** PRY2203-001A
- **Carrera:** Analista Programador Computacional
- **Sede:** Online

---

## 📘 Descripción general del sistema
Este proyecto da respuesta a la Actividad Formativa 2 de la asignatura 
*Desarrollo Orientado a Objetos II*. En la propuesta se desarrolla una 
clase abstracta Pedido y 3 subclases PedidoComida, PedidoExpress,
 PedidoEncomienda que implementan el método CalcularTiempoEntrega() 
y sobreescriben el método base mostrarResumen(). Adicionalmente se implementa
una clase Main que crea instancias de cada subclase y genera resultado en consola a partir
de los métodos sobreescritos de cada objeto creado.

El sistema creado se organiza en paquetes, aplica principios de herencia 
(Pedido -> PedidoComida, PedidoExpress, PedidoEncomienda),
composición (clase Dirección), encapsulamiento (atributos privados y 
métodos getter/setter), polimorfismo (sobreescritura de métodos)
y mantiene documentación de código usando Javadocs.

---

## 🧱 Estructura general del proyecto

```plaintext
docs
└── index.html
src
├── data
├── model
│   ├── Direccion.java
│   ├── Pedido.java
│   ├── PedidoComida.java
│   ├── PedidoEncomienda.java
│   └── PedidoExpress.java
└── ui
    └── Main.java
````

---



## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clone el repositorio desde GitHub:

```bash
git clone https://github.com/jweb93/DuocUC-POO2-AF2.git
```

2. Abra el proyecto en IntelliJ IDEA.

3. Ejecute el archivo `Main.java` desde el paquete `ui`.

4. Puede revisar la documentación del código accediendo al
archivo `docs/index.html`

---

**Repositorio GitHub:** https://github.com/jweb93/DuocUC-POO2-AF2
**Fecha de entrega:** \[24/08/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones 




