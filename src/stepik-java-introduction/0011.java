/**
 * Реализуйте метод, выполняющий численное интегрирование заданной функции на заданном интервале по формуле левых прямоугольников.
 *
 * Функция задана объектом, реализующим интерфейс java.util.function.DoubleUnaryOperator. 
 * Его метод applyAsDouble() принимает значение аргумента и возвращает значение функции в заданной точке.
 * 
 * Интервал интегрирования задается его конечными точками a и b, причем a<=b. 
 * Для получения достаточно точного результата используйте шаг сетки не больше 10−6.
 * 
 * Пример. Вызов
 * integrate(x -> 1, 0, 10)
 * должен возвращать значение 10.
 */
 public static double integrate(DoubleUnaryOperator f, double a, double b) {    
    int n = 100000;
    double h = (b - a) / n;
    double result = 0;    

    for(int i = 0; i < n; i++) {
        result += f.applyAsDouble(a + h * (i + 0.5)); 
    }    

    return result *= h;    
}
 