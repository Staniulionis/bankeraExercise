/// <reference types="cypress"/>

it("Spectrocoin test", () => {
  cy.visit("https://spectrocoin.com/")
  cy.get('button[data-cy="accept-btn"]').click()
  cy.wait(1500)
  cy.contains('All currencies').click()
  cy.wait(1500)
  cy.contains('USD').click()
  cy.contains('EUR').click()
  cy.get('.css-1836tev').should('have.text', 'EUR')
  cy.get('tr:nth-child(1) td:nth-child(3)').should('contain.text', '+')
})