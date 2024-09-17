# def calcula_jogada(pedra, papel, tesoura):
#     return [
#         pedra and not papel and tesoura, # pedra win
#         pedra and papel and not tesoura, # papel win
#         not pedra and papel and tesoura # tesoura win
#     ]

# def entradas(jogador):
#     print(f"Jogador {jogador} digite qualquer coisa para o simbolo que voce quer e no resto tecle enter")
#     simbolos = ["Pedra: ", "Papel: ", "Tesoura: "]
#     return [int(input(simbolos[j])) for j in range(3)]

# jogador1 = [True, False, False]
# jogador2 = [False, True, False]

# if jogador1 == jogador2:
#     print("00")
# else:
#     for i,j in zip(jogador1, jogador2):
#         if i == j:
#             print("11")
#     calcula_jogada([x or y for x,y in zip(jogador1, jogador2)])


import random
 
simbolos = ["Pedra", "Papel", "Tesoura"]

def calcula(jogador1, jogador2):
    if jogador1 not in simbolos or jogador2 not in simbolos:
        print("11")
    if jogador1 == jogador2:
        print("00")
    elif jogador1 == simbolos[0] and jogador2 == simbolos[2] or jogador1 == simbolos[1] and jogador2 == simbolos [0] or jogador1 == simbolos[2] and jogador2 == simbolos[1]:
        print("01") 
    else:
        print("10")
    
# for i in range(5):
#     jogador1 = random.choice(simbolos)
#     jogador2 = random.choice(simbolos)
    
#     print(f"\nJg1 {jogador1} x Jg2 {jogador2}")
#     calcula(jogador1, jogador2)

print("=== TABELA VERDADE ===\n")
num_vars = 3

# Cabeçalho
print(f"| {' | '.join([f'j{i+1}' for i in range(num_vars)])} || s1 | s2 |")

# Loop para percorrer todas as combinações possíveis (2^num_vars)
for i in range(2**num_vars):
    # Constrói a lista de valores de cada variável (binário de i)
    vars = [(i >> j) & 1 for j in reversed(range(num_vars))]
    
    # Exemplo de como calcular s1 e s2 (você pode definir suas próprias regras)
    s1 = vars[0] and not vars[1] and vars[2]  # Exemplo de s1
    s2 = not vars[0] and vars[1] or vars[2]   # Exemplo de s2
    
    # Imprime a linha da tabela
    print(f"|  {' |  '.join(map(str, vars))} || {int(s1)}  | {int(s2)}  |")

