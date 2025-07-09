class EuroLang:  # Parent Class
    def __init__(self, name, branch):
        self.family = "Indo-European"
        self.name = name
        self.branch = branch


class Spanish(EuroLang):  # Child Class
    def __init__(self):
        super().__init__("Spanish", "Romance")


class Hindi(EuroLang):  # Child Class
    def __init__(self):
        super().__init__("Hindi", "Indic")


if __name__ == "__main__":
    spanish_obj = Spanish()
    hindi_obj = Hindi()

    print(f"{spanish_obj.name} is in the {spanish_obj.family} family")
    print(f"The sub-family is {spanish_obj.branch}")

    print(f"{hindi_obj.name} is in the {hindi_obj.family} family")
    print(f"The sub-family is {hindi_obj.branch}")