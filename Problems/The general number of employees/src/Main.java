public static long calcNumberOfEmployees(List<Department> departments, long threshold) {
    return departments.stream()
        .filter(department -> department.getCode().startsWith("111-"))
        .flatMap(department -> department.getEmployees().stream())
        .filter(employee -> employee.getSalary() >= threshold)
        .count();
}