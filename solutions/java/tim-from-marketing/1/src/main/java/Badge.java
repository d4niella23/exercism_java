class Badge {
    public String print(Integer id, String name, String department) {
        String changedDepartment;
            
        if (department == null){
            changedDepartment = "OWNER";
        }
        else {
            changedDepartment = department.toUpperCase();
        }
        if (id == null){
            String message = ( name + " - " + changedDepartment );
            return message;
        }
        else {
            String message = ("[" + id + "] - "+ name + " - " + changedDepartment );
            return message; 
        }
        
    }
}
